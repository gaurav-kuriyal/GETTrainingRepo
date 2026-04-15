export default function GetUser({user}){
    return(<>
        <div>
            <h1>User Details</h1>
            <h4>Id: {user.id}</h4>
            <h4>Name: {user.name}</h4>
            <h4>City: {user.city}</h4>
        </div>
    </>)
}