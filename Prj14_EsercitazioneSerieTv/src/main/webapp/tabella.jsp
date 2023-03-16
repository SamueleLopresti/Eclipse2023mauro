<%@page import="model.Serie"%>
<%@page import="java.util.List"%>
<h1>serie tv</h1>
<table class ="table table-dark">
<%List<Serie> lista = (List<Serie>)request.getAttribute("elencoSerie"); %>
<%for(Serie s :lista){ %>
    <tr>
        <td><%=s.getId() %></td>
        <td><%=s.getTitolo()%></td>
        <td><%=s.getImmagine() %></td>
        <td><%=s.getGenere() %></td>
        <td><%=s.getRating() %></td>
        <td><%=s.isVisto() %></td>
    </tr>
    <%} %>
</table>