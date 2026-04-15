import Card from '@mui/material/Card';
import Button from '@mui/material/Button';
import Stack from '@mui/material/Stack';
import Divider from '@mui/material/Divider';

import { Products } from "./CartReducer";

export function ProductsList({dispatcher}){

    return (<>
        <div className="border" style={{width:"100%"}}>
            <h2>Products List</h2>
            <Stack spacing={4}   divider={<Divider orientation="vertical" flexItem />} >
                {Products.map(p=>(
                <Card key={p.id}>
                    <p><b>Id</b> : {p.id}</p>
                    <p><b>name</b> : {p.name}</p>
                    <p><b>price</b> : {p.price}</p>
                    <Button variant="outlined" onClick={()=>{console.log("clicked");dispatcher({type:"add",productId:p.id})}}>Add To Cart</Button>
                </Card>
            ))}
            </Stack>
        </div>
    </>)
}