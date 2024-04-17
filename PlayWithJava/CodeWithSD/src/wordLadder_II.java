

class Solution {

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        Map<String, List<String>> graph=new HashMap<>();
        Set<String> wordSet=new HashSet<>(wordList);

        Map<String,Integer> distance=new HashMap<>();
        List<List<String>> result= new ArrayList<>();
        if (!wordSet.contains(endWord)) return result;
        bfs(beginWord,endWord,graph,wordSet,distance);
        dfs(beginWord,endWord,graph,new ArrayList(),result,distance);

        return result;
    }

    private static List<String> neighbor(String currentString,Set<String> wordSet){
        List<String> listOfString=new ArrayList<>();
        String tempString=currentString;
        char[] convertedToChar=tempString.toCharArray();
        for(int i=0;i<currentString.length();i++){
            char originalChar=convertedToChar[i];
            for(char j='a';j<='z';j++){

                convertedToChar[i]=j;
                String str=new String(convertedToChar);
                if(wordSet.contains(str) && !str.equals(currentString)) {
                    listOfString.add(str);
                }
            }
            convertedToChar[i]=originalChar;
        }
        return listOfString;
    }
    private static void bfs(String beginWord,String endWord,Map<String,List<String>> graph,Set<String> wordSet,Map<String,Integer> distance){
        Queue<String> queue=new LinkedList<>();
        queue.offer(beginWord);
        distance.put(beginWord,0);
        while(!queue.isEmpty()){
            boolean foundEnd=false;
            int size=queue.size();
            for(int i=0;i<size;i++){
                String currentString=queue.poll();
                int distanceOfCurrentString=distance.get(currentString);
                List<String> collectionOfNeighbors=neighbor(currentString,wordSet);
                graph.put(currentString,collectionOfNeighbors);
                for(String neighborString : collectionOfNeighbors){
                    if(!distance.containsKey(neighborString)){
                        distance.put(neighborString,distanceOfCurrentString+1);
                        if(neighborString.equals(endWord)){
                            foundEnd=true;
                        }else
                            queue.offer(neighborString);
                    }

                }
            }
            if(foundEnd)
                break;
        }

    }
    private static void dfs(String currentWord,String endWord,Map<String,List<String>> graph,List<String> tempArray,List<List<String>> result,Map<String,Integer> distance){

        tempArray.add(currentWord);
        if(currentWord.equals(endWord)){
            result.add(new ArrayList<>(tempArray));
        }else{
            for(String strCurrentNeighbor : graph.get(currentWord)){
                if(distance.get(strCurrentNeighbor)==distance.get(currentWord)+1) {
                    dfs(strCurrentNeighbor,endWord,graph, tempArray, result, distance);

                }

            }
        }
        tempArray.remove(tempArray.size()-1);
    }
}
