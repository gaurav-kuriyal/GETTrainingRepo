import AppBar from '@mui/material/AppBar';
import Toolbar from '@mui/material/Toolbar';
import Stack from '@mui/material/Stack';


export function Navbar(props) {
    return <>
        <AppBar position="static" className="navbar navbar-expand-lg gap-2">
            <Stack spacing={2} direction="row" className="">
                <button className="nav-link active border px-4 py-2 rounded" onClick={() => { }} >Product List</button>
                <button className="nav-link active border px-4 py-2 rounded" onClick={() => { }} >Cart</button>
                <button className="nav-link active border px-4 py-2 rounded" onClick={() => { }} >Checkout</button>
            </Stack>
        </AppBar>
    </>
}