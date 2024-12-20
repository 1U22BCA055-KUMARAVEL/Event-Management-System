<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Event Management</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f9;
        }
        header {
            background-color: #333;
            color: white;
            padding: 1rem 0;
            text-align: center;
        }
        nav {
            display: flex;
            justify-content: center;
            background-color: #444;
            padding: 0.5rem 0;
        }
        nav a {
            color: white;
            text-decoration: none;
            margin: 0 1rem;
            font-size: 1.1rem;
        }
        nav a:hover {
            text-decoration: underline;
        }
        section {
            padding: 2rem;
            text-align: center;
        }
        .about {
            background-color: #eef;
            padding: 2rem;
        }
        .services {
            background-color: #fee;
            padding: 2rem;
        }
        .contact {
            background-color: #efe;
            padding: 2rem;
        }
        footer {
            text-align: center;
            background-color: #333;
            color: white;
            padding: 1rem 0;
            position: fixed;
            bottom: 0;
            width: 100%;
        }
        #login{
        width:10%;
        float:right;
        }
    </style>
</head>
<body>
    <header>
        <h1>Welcome to Event Management</h1>
        <p>Your one-stop solution for organizing unforgettable events!</p>
        <div id="login">
        <button onclick="one()">Login</button>
        <button onclick="two()">Register</button>
        </div>
    </header>
    <nav>
        <a href="#about">About Us</a>
        <a href="#services">Services</a>
        <a href="#contact">Contact</a>
    </nav>
    <section id="about" class="about">
        <h2>About Us</h2>
        <p>We specialize in organizing a variety of events, including weddings, corporate meetings, and parties.</p>
        <p>With years of experience, our team ensures every event is unique and memorable.</p>
    </section>
    <section id="services" class="services">
        <h2>Our Services</h2>
        <ul>
            <li>Wedding Planning</li>
            <li>Corporate Events</li>
            <li>Birthday Parties</li>
            <li>Venue Decoration</li>
            <li>Entertainment Booking</li>
        </ul>
    </section>
    <section id="contact" class="contact">
        <h2>Contact Us</h2>
        <p>Email: info@eventmanagement.com</p>
        <p>Phone: +1 123-456-7890</p>
        <p>Address: 123 Event Lane, Celebration City</p>
    </section>
    <footer>
        <p>&copy; 2024 Event Management. All rights reserved.</p>
    </footer>
    <script>
    function one(){
    	window.location.href="login.jsp";
    	
    }
    function two(){
    	window.location.href="registration.jsp";
    }
    </script>
</body>
</html>
