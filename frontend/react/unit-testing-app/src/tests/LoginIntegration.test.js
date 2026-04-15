import userEvent from "@testing-library/user-event"
import { Login } from "../component/Login";
import { render, screen } from "@testing-library/react";

describe('login integration test', () => {
    test('should login successfull for valid username and password', () => {
        const user = userEvent;
        window.alert = jest.fn();
        render(<Login />)
        const unameInput = screen.getByLabelText('Username');
        const pwdInput = screen.getByLabelText('Password');
        const button = screen.getByRole("button", { name: "Login" });

        user.type(unameInput, 'gaurav');
        user.type(pwdInput, "gaurav123");
        user.click(button);

        expect(unameInput).toHaveValue("gaurav");
        expect(pwdInput).toHaveValue("gaurav123");
        expect(window.alert).toHaveBeenCalledWith("Logged in successfully");
    })


    test('should login failure for invalid username and password', () => {
        const user = userEvent;
        window.alert = jest.fn();
        render(<Login />)
        const unameInput = screen.getByLabelText('Username');
        const pwdInput = screen.getByLabelText('Password');
        const button = screen.getByRole("button", { name: "Login" });

        user.type(unameInput, 'Gaurav');
        user.type(pwdInput, "Gaurav@123");
        user.click(button);

        expect(unameInput).toHaveValue("Gaurav");
        expect(pwdInput).toHaveValue("Gaurav@123");
        expect(window.alert).toHaveBeenCalledWith("Invalid Credentials");
    })
})

// npm i @testing-library/user-event@latest