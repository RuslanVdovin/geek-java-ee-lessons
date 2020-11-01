package ru.geekbrains;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/title")
public class TitleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();

        writer.printf("<link rel='stylesheet' href='%s'/style.css'>", req.getContextPath());

        writer.println("<ul>");
        writer.printf("<li><a href='%s/main'>Главная</a></li>", req.getContextPath());
        writer.printf("<li><a href='%s/catalog'>Каталог</a></li>", req.getContextPath());
        writer.printf("<li><a href='%s/product'>Продукты</a></li>", req.getContextPath());
        writer.printf("<li><a href='%s/cart'>Корзина</a></li>", req.getContextPath());
        writer.printf("<li><a href='%s/order'>Заказ</a></li>", req.getContextPath());
        writer.println("</ul>");
    }
}