import { Component } from "react";

export default class Counter extends Component {
    constructor(props){
        super(props);
        this.state={
            count:0
        };
    }

    increment=()=>{
        // this.state.count++;
        this.setState({
             count: this.state.count+1
        })
    }
    decrement=()=>{
        this.setState({
             count: this.state.count-1
        })
    }

    render() {
        return (
            <>
                <div>
                    <h1>Count: {this.state.count}</h1>
                    <button className="btn btn-success" onClick={this.increment}>+</button>
                    <button className="btn btn-danger" onClick={()=>this.decrement()}>-</button>
                    <button className="btn btn-primary" onClick={()=>this.setState({count:0})}>Reset</button>
                </div>
            </>
        )
    }
}