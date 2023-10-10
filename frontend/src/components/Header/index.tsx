import React from 'react';
import './styles.css';
import { ReactComponent as Logo } from '../../assets/logo-white.svg';
import { Link } from 'react-router-dom';

const Header = () => (
    <header className='main-header'>
        
        <Link to="/">
            <Logo />
            <div className='logo-text-1'>GPCR</div>
        </Link>
    </header>
);
export default Header;