export class Hotel {
    id!:number
    name!: string
    rating : number = 5
    contact !: number
    address!: string
    featured: boolean = false
    openForBooking : boolean = true

    constructor(id:number,name:string, contact: number,address:string){
        this.id=id;
        this.name = name;
        this.contact=contact
        this.address=address;
    }
}
