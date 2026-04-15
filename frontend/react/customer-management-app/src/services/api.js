import axios from "axios"

const BASE_URL="http://localhost:8000"
// export default class CustomerService{
//     async getCustomers(){
//         const response = await axios.get(BASE_URL+"/customers");
//         const customers = response.data;
//         return customers;
//     }
// }

const api = axios.create({
    baseURL:BASE_URL
})

export default api;