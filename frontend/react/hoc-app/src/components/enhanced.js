export default function EnhancedComponent(Component,myname){
    return function (props){
        return <>
        <div style={{"padding":"10px","border":"2px solid black","margin":"10px","borderRadius":"10px"}}>
            <p>My Name</p>
            <Component {...props} myname={myname} />
        </div>
        </>
    }  
}