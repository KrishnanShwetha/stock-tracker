import React from "react";
import { Nav, NavLink, NavMenu } 
    from "./NavbarElements";

const Navbar = () => {
    return (
        <>
        <Nav>
        <NavMenu>
        <NavLink to="/signup" activeStyle>
            Sign Up
          </NavLink>
        <NavLink to="/login" activeStyle>
            Log In
        </NavLink>
        <NavLink to="/index" activeStyle>
            Search
        </NavLink>
          <NavLink to="/Plots" activeStyle>
            Plot 
          </NavLink>
        </NavMenu>
        </Nav>
        </>
    );
};

export default Navbar;