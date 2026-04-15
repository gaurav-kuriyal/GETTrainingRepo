import { render, screen } from "@testing-library/react";
import userEvent from "@testing-library/user-event"
import Counter from "../component/Counter";

test('increment count on button click',async ()=>{
    // const user = userEvent;
    render(<Counter />)
    const button = screen.getByRole('button',{name:"Increment"})
    await userEvent.click(button);
    expect(screen.getByText('Count:1')).toBeInTheDocument();
})