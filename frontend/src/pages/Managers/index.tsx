import React, { useEffect, useState } from "react";
import axios from "axios";
import './style.css';
import { ManagersResponse } from './types';
import { formatDate } from "./helpers";
import Pagination from "./Pagination";
import { Link } from 'react-router-dom';
import Delete from '../../assets/del.png';


const BASE_URL = 'http://localhost:8080';

const Managers = () => {
    const [managersResponse, setManagersResponse] = useState<ManagersResponse>();
    const [activePage, setActivePage] = useState(0);    

    useEffect(() => {
        axios.get(`${BASE_URL}/managers?size=12&page=${activePage}`)
            .then(response => setManagersResponse(response.data));
    },[activePage]);   

    const handlePageChange = (index: number) => {
        setActivePage(index);
    }  

    return (
        <div className="page-container">
            <div className="filters-container records-actions">
                <Link to='/'>
                    <button className="actionr-filter">
                        Novo
                    </button>
                </Link>
            </div>
            <table className="records-table" cellPadding="0" cellSpacing="0">
                <thead>
                    <tr>
                        <th>Nome</th>
                        <th>Nascimento</th>
                        <th>E-Mail</th>
                        <th>Telefone Principal</th>
                        <th>Telefone Secundário</th>
                        <th>Ações</th>
                    </tr>
                </thead>
    
                <tbody>
                    { managersResponse?.content.map( record => (
                        <tr key={record.id}>
                        <td className="text-primary">{record.name}</td>
                        <td>{formatDate(record.birth)}</td>
                        <td>{record.email}</td>
                        <td className="text-primary">{record.phone1}</td>
                        <td>{record.phone2}</td>
                        <td><img src={Delete}></img></td>
                        </tr> 
                    ))}
                             
                </tbody>
            </table>
            <Pagination 
                activePage={activePage} 
                totalpages={managersResponse?.totalPages}
                goToPage={handlePageChange}
            />
        </div>
    )
};
export default Managers;