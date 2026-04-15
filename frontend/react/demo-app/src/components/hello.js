// export default function Hello() {
//     return(
//         <>
//             <h1>Hello</h1>
//         </>
//     )
// }

import { Component } from "react";

export default class Hello extends Component {
    render() {
        return (
            <>
                <h1>Hello using class component</h1>
                <h2>{this.props.myname}</h2>
            </>
        )
    }
}