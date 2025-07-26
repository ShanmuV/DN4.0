import React from "react";

class Posts extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
    };
  }

  async loadPosts() {
    const res = await fetch("https://jsonplaceholder.typicode.com/posts");
    const json = await res.json();
    this.setState({ posts: json });
    console.log(this.posts);
  }

  componentDidMount() {
    this.loadPosts();
  }

  componentDidCatch(error, info) {
    console.log("Error occured: " + info);
  }

  render() {
    return (
      <>
        <ul style={{ listStyleType: "none" }}>
          {this.state.posts.map((value, index) => {
            return (
              <div key={value.id} style={{ margin: 10 }}>
                <li>
                  <table cellSpacing={10}>
                    <tbody>
                      <tr>
                        <td>ID</td>
                        <td>{value.id}</td>
                      </tr>
                      <tr>
                        <td>Title</td>
                        <td>{value.title}</td>
                      </tr>
                      <tr>
                        <td>Body</td>
                        <td>{value.body}</td>
                      </tr>
                    </tbody>
                  </table>
                </li>
              </div>
            );
          })}
        </ul>
      </>
    );
  }
}

export default Posts;
