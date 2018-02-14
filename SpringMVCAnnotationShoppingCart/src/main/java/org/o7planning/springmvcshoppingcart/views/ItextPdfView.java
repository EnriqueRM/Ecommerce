package org.o7planning.springmvcshoppingcart.views;


import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.o7planning.springmvcshoppingcart.model.CartInfo;
import org.o7planning.springmvcshoppingcart.util.Utils;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class ItextPdfView extends AbstractITextPdfView {


    @Override
    protected void buildPdfDocument(Map<String, Object> model,
                                    Document document, PdfWriter writer, HttpServletRequest request,
                                    HttpServletResponse response) throws Exception {

        @SuppressWarnings("unchecked")
        CartInfo cartInfo = Utils.getCartInSession(request);

        PdfPTable table = new PdfPTable(4);
        table.setWidths(new int[]{25, 25, 25, 25 });
        
        	//Nombre de las celdas
            table.addCell("Nombre");
            table.addCell("Email");
            table.addCell("Telefono");
            table.addCell("Direccion");
            
            //
            table.addCell(cartInfo.getCustomerInfo().getName());
            table.addCell(cartInfo.getCustomerInfo().getEmail());
            table.addCell(cartInfo.getCustomerInfo().getPhone());
            table.addCell(cartInfo.getCustomerInfo().getAddress());
        
            document.add(table);
            


    }

}