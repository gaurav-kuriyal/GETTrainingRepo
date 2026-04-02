export class Student {
    sid !: number;
    sname !: string;
    course !: string;
    constructor(sid:number,sname:string,course:string){
        this.sid = sid;
        this.sname = sname;
        this.course = course;
    }
}
