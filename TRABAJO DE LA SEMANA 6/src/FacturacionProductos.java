/*

    Problema-1

    Facturación de 2 productos: La empresa Amazon.com le contrata como desarrollador de Sistemas Informáticos para programar su sistema de compras online, el cual calcule el precio total de la compra para un cliente. Para ello, se necesita utilizar estructuras secuenciales y de selección (if simple, doble y/o anidadas), sin aplicar ciclos repetitivos.

    Requisitos:

        La empresa inicialmente venderá solo 2 tipos de productos distintos, a costos variantes.
        Al costo total de la factura, se debe incluir los gastos por concepto de transporte/envío del paquete, del cual no se aplican ningún tipo de descuentos o impuestos dada la excepción descrita en el punto 3.b.
        El objetivo es presentar al usuario los detalles de su compra: costos, impuestos, descuentos, monto final dadas las siguientes condiciones: a. Si el subtotal de la compra (sin descuentos o gastos de envío), supera los $1000, se le otorga un 20% de descuento; y si es al menos los $1000 el descuento es como mínimo 5%. b. Adicional, si la compra es mayor a $5000, el envío será gratuito. c. El IVA del 10% se debe aplicar a todos los artículos antes de agregar cualquier tipo de descuesto o promoción.
        A continuación, algunos ejemplos de una factura modelo:


*/
import java.util.Scanner;
public class FacturacionProductos {
    public static void main(String[] args) {
        /*
        Resolucion Del Problema
        */
        Scanner teclado = new Scanner (System.in);
        double iphone, ipad, iphoneCosto,ipadCosto, iphoneCostoT, ipadCostoT, subtotal, descuento1, descuento2, envio, subtotalIva, montoFactura1, montoFactura2;
        System.out.println("Ingrese el Envio que se puede adquirir: ");
        envio = teclado.nextDouble();
        System.out.println("Ingrese la cantidad de Iphones Compradas: ");
        iphone = teclado.nextDouble();
        System.out.println("Ingrese la cantidad de Ipads Compradas: ");
        ipad = teclado.nextDouble();
        System.out.println("Ingrese el costo del IPHONE por unidad: ");
        iphoneCosto = teclado.nextDouble();
        iphoneCostoT = iphone * iphoneCosto;
        System.out.println("Ingrese el costo por unidad del IPAD: ");
        ipadCosto = teclado.nextDouble();
        ipadCostoT = ipad * ipadCosto;
        subtotal = (ipadCostoT + iphoneCostoT);
        subtotalIva = ((ipadCostoT + iphoneCostoT) * 0.12) + subtotal;
        descuento1 = (subtotal * 0.20);
        descuento2 = (subtotal * 0.050);
        montoFactura1 = (subtotal + (subtotal - descuento1)*0.12)+envio;
        montoFactura2 = (subtotal + (subtotal - descuento1)*0.12);
        System.out.println("Costo Iphones: " + iphoneCostoT);
        System.out.println("Costo Ipads. " + ipadCostoT);
        System.out.println("SUBTOTAL: " + subtotal);
        System.out.println("Subtotal + IVA: " + subtotalIva);
        if (montoFactura1>1000)
            System.out.println("DESCUENTO: " + descuento1);
        else
            System.out.println("DESCUENTO: " + descuento2);
        if (subtotal < 5000)
            System.out.println("ENVIO: " + envio);
        System.out.println("MONTO FACTURA: " + montoFactura1);
    }   
}
