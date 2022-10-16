import React from 'react';
import Stock from './Stock.js';

const searchFetch = () => {
    fetch(`https://www.alphavantage.co/query?function=SYMBOL_SEARCH&keywords=${this.state.inputValue}&apikey=IOJR3FGTVTYC4D2A`)
    .then(res => res.json())
    .then(searchdata =>
    this.setState({ searchData: searchdata['bestMatches'] }, () => console.log(this.state.searchData))
    )
    }

class SearchBar extends React.Component{
    constructor(props){
        super(props)
        this.state = {
            inputValue: 'AMZN'
        }
    }

render(){
    return(
    <form style={{ paddingTop: "75px" }} onSubmit={(e) => this.submitHandler(e)}>
    <label>
     Enter ticker symbol: 
    </label>
    <input type="text" onChange={(e) => this.handleInputChanger(e)}>
    </input>
    <button onClick={searchFetch} type="submit">
     Submit
    </button>
 </form>
    )
}

}

export default SearchBar;