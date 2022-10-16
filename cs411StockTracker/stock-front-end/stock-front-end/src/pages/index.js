import React from 'react';
import Stock from './Stock.js';
import SearchBar from './searchBar.js';  
import './searchBar.css';

// const posts = [
//   { id: '1', name: 'This first item is a stock' },
//   { id: '2', name: 'This next post is also a stock' },
//   { id: '3', name: 'We have yet another stock!' },
//   { id: '4', name: 'This is the fourth and final stock' },
// ];

// const filterPosts = (posts, query) => {
//   if (!query) {
//       return posts;
//   }

//   return posts.filter((post) => {
//       const postName = post.name.toLowerCase();
//       return postName.includes(query);
//   });
// };

const Home = () => {
  return (
    <div>
      <h1>Welcome to stock tracker</h1>
      <SearchBar />
    </div>
  );
};
  
export default Home;