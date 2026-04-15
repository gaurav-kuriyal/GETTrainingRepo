import { render, screen } from "@testing-library/react"
import Hello from "../component/HelloComponent"

test('render given name',()=>{
    render(<Hello name="Gaurav" ></Hello>)
    expect(screen.getByText('Gaurav')).toBeInTheDocument();
})