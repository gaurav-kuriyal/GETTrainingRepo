import Card from '@mui/material/Card';
import Button from '@mui/material/Button';
import Stack from '@mui/material/Stack';
import Divider from '@mui/material/Divider';

export function CartComponent({ cart, dispatcher }) {

    return (<>
        <div className="border" style={{ width: "100%" }}>
            <h2>Cart</h2>
            <Stack spacing={4} divider={<Divider orientation="vertical" flexItem />}>
                {cart.products.map((p,index) => (
                    <Card key={index}>
                        <p>{p.name} - {p.price} * {p.quantity} </p>
                        <Stack spacing={2} direction="row">
                            <Button variant="outlined" onClick={() => dispatcher({ type: "increase", productId: p.id })} >+</Button>
                            <Button variant="outlined" onClick={() => dispatcher({ type: "decrease", productId: p.id })} >-</Button>
                            <Button variant="outlined" onClick={() => dispatcher({ type: "remove", productId: p.id })} >Remove</Button>
                        </Stack>
                    </Card>
                ))}
            </Stack>

            <div>
                Total Cost = {cart.cost}
            </div>
        </div>
    </>)
}