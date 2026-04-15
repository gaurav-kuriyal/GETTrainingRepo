import { Component } from "react";

export default class CheckNumber extends Component {
    constructor(props){
        super(props);
        this.state={
            number:36,
            message:""
        };
    }

    checkEven=()=>{
        this.setState({
            message:this.state.number+ (this.state.number%2===0?" is Even Number":" is Odd Number")
        })
    }

    render() {
        return (
            <>
                <div>
                    <h1>number: {this.state.number}</h1>
                    <h1>message: {this.state.message}</h1>
                    <button className="btn btn-success" onClick={this.checkEven}>Check</button>
                </div>
            </>
        )
    }
}