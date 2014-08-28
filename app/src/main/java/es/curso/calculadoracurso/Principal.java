package es.curso.calculadoracurso;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;


public class Principal extends Activity {

    public Button boton0;
    public Button boton1;
    public Button boton2;
    public Button boton3;
    public Button boton4;
    public Button boton5;
    public Button boton6;
    public Button boton7;
    public Button boton8;
    public Button boton9;
    public Button punto;
    public TextView texto;

    public String valorPrimer;
    public String operacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        setContentView(R.layout.principal);
        boton0=(Button)findViewById(R.id.button0);
        boton1=(Button)findViewById(R.id.button1);
        boton2=(Button)findViewById(R.id.button2);
        boton3=(Button)findViewById(R.id.button3);
        boton4=(Button)findViewById(R.id.button4);
        boton5=(Button)findViewById(R.id.button5);
        boton6=(Button)findViewById(R.id.button6);
        boton7=(Button)findViewById(R.id.button7);
        boton8=(Button)findViewById(R.id.button8);
        boton9=(Button)findViewById(R.id.button9);
        punto=(Button)findViewById(R.id.buttonPunto);


        texto=(TextView)findViewById(R.id.textView);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public void numero0(View v){

        texto.setText(texto.getText()+""+ boton0.getText());
    }
    public void numero1(View v){

        texto.setText(texto.getText()+""+ boton1.getText());
    }
    public void numero2(View v){

        texto.setText(texto.getText()+""+ boton2.getText());
    }
    public void numero3(View v){

        texto.setText(texto.getText()+""+ boton3.getText());
    }
    public void numero4(View v){

        texto.setText(texto.getText()+""+ boton4.getText());
    }
    public void numero5(View v){

        texto.setText(texto.getText()+""+ boton5.getText());
    }
    public void numero6(View v){

        texto.setText(texto.getText()+""+ boton6.getText());
    }
    public void numero7(View v){
        texto.setText(texto.getText()+""+ boton7.getText());
    }
    public void numero8(View v){
        texto.setText(texto.getText()+""+ boton8.getText());
    }
    public void numero9(View v){
        texto.setText(texto.getText()+""+ boton9.getText());
    }
    public void borrar(View v){
        texto.setText("");
    }
    public void punto(View v){


        try {
            Long.parseLong(texto.getText().toString());
            texto.setText(texto.getText()+"." );
        } catch (NumberFormatException e) {

        }


    }
    public void suma(View v ){
        valorPrimer = texto.getText().toString();
        operacion="suma";
        texto.setText("");
    }
    public void divide(View v ){
        valorPrimer = texto.getText().toString();
        operacion="divide";
        texto.setText("");
    }
    public void multiplica(View v ){
        valorPrimer = texto.getText().toString();
        operacion="multiplica";
        texto.setText("");
    }
    public void resta(View v ){

        valorPrimer = texto.getText().toString();
        operacion="resta";
        texto.setText("");

    }
    public void calculo(View v){
        Log.e("operacion", operacion);
        if (operacion.equals("suma")){
            texto.setText(Double.parseDouble(valorPrimer)+ Double.parseDouble(texto.getText().toString())+"");
        }else if(operacion.equals("resta")){
            texto.setText(Double.parseDouble(valorPrimer)- Double.parseDouble(texto.getText().toString())+"");
        }else if(operacion.equals("divide")){
            texto.setText(Double.parseDouble(valorPrimer)/ Double.parseDouble(texto.getText().toString())+"");
        }else if (operacion.equals("multiplica")){
            texto.setText(Double.parseDouble(valorPrimer)* Double.parseDouble(texto.getText().toString())+"");
        }


    }


}
