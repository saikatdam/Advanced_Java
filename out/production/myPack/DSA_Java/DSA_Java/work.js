import {value} from "./anotherFile.js"
console.log(value);
class first{
    constractor(value){
        this.value=value;
    }
    info(){
        // console.log(`my name is lakhan  . and roll no is ${this.value}`);
        console.log(this.value);
    }
}
class second extends first{
 info(){
    super.info();
 }
}

obj=new second(19);
obj.info();