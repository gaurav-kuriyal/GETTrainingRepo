export function UserStatus({user, dispatcher}){
    // const changeToOffline= ()=>{
    //     setUser({
    //         ...user,status:"offline"
    //     })
    // }
    // const changeToOnline= ()=>{
    //     setUser({
    //         ...user,status:"online"
    //     })
    // }
    return(

        <div>
            <button onClick={()=>dispatcher({type:"changeToOffline", payload:"offline"})}>Offline</button>
            <button onClick={()=>dispatcher({type:"changeToOnline", payload:"online"})}>Online</button>
        </div>
    )
}