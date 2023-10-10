export type ManagersResponse = {
    content: ManagerItem[];
    totalPages: number;
}

export type ManagerItem = {
    id: number,
    name: string,
    email: string,
    phone1: string,
    phone2: string,
    cep: string,
    street: string,
    number: number,
    city: string,
    states: string,
    birth: string,
    cpf: string,
    rg: string
}