import userEvent from "@testing-library/user-event"
import { Login } from "../component/Login";
import { render, screen } from "@testing-library/react";

test('accepts uname and password and clicks login',async () => {
    const user = userEvent;
    render(<Login />);

    // const unameInput=screen.getByRole('Username');
    const unameInput=screen.getByLabelText('Username');
    // const pwdInput = screen.getByRole('Password');
    const pwdInput = screen.getByLabelText('Password');
    const button=screen.getByRole("button",{name:"Login"});

    await user.type(unameInput,'Gaurav');
    await user.type(pwdInput,"Gaurav@123");
    await user.click(button);

    expect(unameInput).toHaveValue("Gaurav"); 
    expect(pwdInput).toHaveValue("Gaurav@123"); 
})