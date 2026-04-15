export const Products=[
    {id:1,name:'laptop',price:70000},
    {id:2,name:'mouse',price:400},
    {id:3,name:'keyboard',price:8000},
    {id:4,name:'desktop',price:2000},
    {id:5,name:'monitor',price:12000}
]

export const Cart={
    products:[],
    cost:0
}

export function CartReducer(state,action){
    console.log(state)
    switch(action.type){
        case "add":
            const productId = action.productId;
            let product = state.products.find(p=>p.id===productId);
            const p = Products.find(p=>p.id===productId);

            if(!product){
                product = {...p,quantity:1}
                state.products.push(product)
            } else{
                // product = {...product,quantity:product.quantity+1}
                state.products.forEach(p=>{
                    if(p.id===productId){
                        p.quantity= p.quantity+1;
                    }
                })
            }
            state.cost += p.price
            console.log("added ",state)
            return {...state};

        case "remove":
            const productId_remove = action.productId;
            let product_remove = state.products.find(p=>p.id===productId_remove);
            state.cost -= product_remove.quantity * product_remove.price;
            state.products = state.products.filter(p=>p.id!==productId_remove);
            console.log("removed ",state)
            return {...state};

        case "increase":
            const productId_increase = action.productId;
            state.products.forEach(p=>{
                    if(p.id===productId_increase){
                        p.quantity= p.quantity+1;
                        state.cost += p.price
                    }
                })
            console.log("icreased ",state)
            return {...state};

        case "decrease":
            const productId_decrease = action.productId;
            state.products.forEach(p=>{
                    if(p.id===productId_decrease){
                        p.quantity= p.quantity-1;
                        state.cost -= p.price
                    }
                })
            let decreased_product = state.products.find(p=>p.id===productId_decrease);
            console.log(decreased_product.quantity == 0)
            if(decreased_product.quantity == 0) state.products = state.products.filter(p=>p.id!==productId_decrease);
            // state.cost += p.price
            console.log("decreased ",state)
            return {...state};

        case "empty":
            state={
                products:[],
                cost:0
            }

            return {...state};
        default :
            return {...state};
        
    }
}