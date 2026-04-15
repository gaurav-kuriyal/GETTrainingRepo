export function UserList({ dispatcher }) {
    // const setUser1 = () => {
    //     setUser({
    //         id: 1,
    //         name: 'gaurav',
    //         role: 'admin',
    //         status: 'online'
    //     })
    // }
    
    // const setUser2 = () => {
    //     setUser({
    //         id: 2,
    //         name: 'rajjo',
    //         role: 'developer',
    //         status: 'busy'
    //     })
    // }

    return(
        <div>
            <button onClick={()=>dispatcher({type:"select1"})}>Select 1</button>
            <button onClick={()=>dispatcher({type:"select1"})}>Select 2</button>
        </div>
    )
}