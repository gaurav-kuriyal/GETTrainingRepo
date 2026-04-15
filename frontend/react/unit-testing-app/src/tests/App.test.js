import { render, screen } from "@testing-library/react"
import App from "../App"

test('checks Hello component is rendered in App',()=>{
    render(<App />)
    expect(screen.getByText("Welcome")).toBeInTheDocument();
})