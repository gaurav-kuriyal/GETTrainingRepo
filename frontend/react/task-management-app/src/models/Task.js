export class Task{
    constructor(id,name,status="Todo"){
        this.id = id;
        this.name = name;
        this.status = status;
    }

    toJSON(){
        return{
            id:this.id,
            name:this.name,
            status: this.status
        }
    }
}