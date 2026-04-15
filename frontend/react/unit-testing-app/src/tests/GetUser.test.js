import { render, screen } from "@testing-library/react"
import GetUser from "../component/GetUser"

test('render user details', () => {
    const user = {
        id: 2,
        name: "Rajjo",
        city: "Ghaziabad"
    }

    render(<GetUser user={user} />)
    expect(screen.getByText('User Details')).toBeInTheDocument();
    expect(screen.getByText('Id: 2')).toBeInTheDocument();
    expect(screen.getByText('Name: Rajjo')).toBeInTheDocument();
    expect(screen.getByText('City: Ghaziabad')).toBeInTheDocument();
})