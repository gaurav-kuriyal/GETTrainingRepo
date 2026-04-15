export const User = {
    id: 1,
    name: 'gaurav',
    role: 'trainee',
    status: 'offline'
}

export function UserReducer(state, action) {
    switch (action.type) {
        case "select1":
            return {
                id: 1,
                name: 'gaurav',
                role: 'admin',
                status: 'online'
            };

        case "select2":
            return {
                id: 2,
                name: 'rajjo',
                role: 'developer',
                status: 'busy'
            };
        case "changeName":
            return {
                ...state,
                name: action.payload
            };
        case "changeRole":
            return {
                ...state,
                role: action.payload
            };
        case "changeToOffline":
            return {
                ...state,
                status: action.payload
            };
        case "changeToOnline":
            return {
                ...state,
                status: action.payload
            };
        default:
            return state;
    }
}