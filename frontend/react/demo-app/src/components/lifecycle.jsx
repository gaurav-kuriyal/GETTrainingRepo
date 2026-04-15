import { Component } from "react"

export default class LifeCycle extends Component{
    constructor(props){
        super(props);
        this.state ={
            name:"Gaurav"
        }
        console.log("Constructor Called");
    }

    componentDidMount(){
        console.log("Component mounted");
    }
    
    componentDidUpdate(){
        console.log("Component updated");
    }
    
    componentWillUnmount(){
        console.log("Component unmounted");
    }

    changeName=()=>{
        console.log("Change name called");
        this.setState({
            name:"Gaurav Kuriyal"
        })
    }


    render(){
        console.log("Render Called");
    
        return<>
            <div><h1>{this.state.name}</h1></div>
            <button onClick={this.changeName}>Change</button>
        </>
    }
}