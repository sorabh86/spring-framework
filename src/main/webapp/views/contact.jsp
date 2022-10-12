<%-- 
    Document   : contact
    Created on : 27-Dec-2021, 9:50:36 pm
    Author     : sorabh
--%>
<%@include file="../../header.jsp" %>

    <h1>Contact</h1>

    <h3>${empty name ? "no-name" : name}</h3>
    <% String name = (String)request.getAttribute("name");
            if(name!="") { %>
    <div class="alert">
        <p>Your message is posted successfully.</p>
        <p>Name: ${name}</p>
        <p>Email: ${email}</p> 
        <p>Message: ${message}</p> 
    </div>
    <% } %>
    <form action="/contact" method="POST">
        <div class="form-group">
            <label>Name: <input type="text" name="name" placeholder="Enter Your Name"></label>
        </div>
        <div class="form-group">
            <label>Email: <input type="text" name="email" placeholder="Enter Your Email"></label>
        </div>
        <div class="form-group">
            <label>Message: <textarea name="message" rows="5" cols="10" placeholder="Enter Your Enquiry"></textarea></label>
        </div>
        <button type="submit">Submit</button>
    </form>

<%@include file="../../footer.jsp" %>