export class Student {
    id !: string;
    sname !: string;
    course !: string;
    constructor(id:string,sname:string,course:string){
        this.id = id;
        this.sname = sname;
        this.course = course;
    }
}
