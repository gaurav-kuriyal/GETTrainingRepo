export function UserProfile({user,dispatcher}){
    // const changeName = ()=>{
    //     setUser({
    //         ...user,name:"mayank"
    //     })
    // }
    // const changeRole = ()=>{
    //     setUser({
    //         ...user,role:"employee"
    //     })
    // }
    return(
        <div>
            <button onClick={()=>{dispatcher({type:"changeName",payload:"mayank"})}}>changeName</button>
            <button onClick={()=>{dispatcher({type:"changeRole",payload: "employee"})}}>changeRole</button>
        </div>
    )
}