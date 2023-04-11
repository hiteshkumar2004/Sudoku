package com.example.slove_it

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.Toast
import com.example.slove_it.databinding.ActivityMainBinding
import kotlin.random.Random
import kotlin.random.nextInt


class easy : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val hint=findViewById<Button>(R.id.hint)
        hint.text="\uD83D\uDCA1SOS  12"
        board()
        val new=findViewById<Button>(R.id.ne)
        new.setOnClickListener {
            board()
        }
        val wl=findViewById<Button>(R.id.wl)
        wl.setOnClickListener {win=0;lose=0; wl.text="Win:0  Lose:0" }
        val home=findViewById<Button>(R.id.home)
        home.setOnClickListener {
            startActivity(Intent(this,mainpage::class.java))
        }


    }

    var win=0;
    var lose=0

    private fun board(){




        //block1
        val b1=findViewById<Button>(R.id.B1)
        val b2=findViewById<Button>(R.id.b2)
        val b3=findViewById<Button>(R.id.b3)
        val b4=findViewById<Button>(R.id.b4)
        val b5=findViewById<Button>(R.id.b5)
        val b6=findViewById<Button>(R.id.b6)
        val b7=findViewById<Button>(R.id.b7)
        val b8=findViewById<Button>(R.id.b8)
        val b9=findViewById<Button>(R.id.b9)
        //block 2
        val b11=findViewById<Button>(R.id.b11)
        val b12=findViewById<Button>(R.id.b12)
        val b13=findViewById<Button>(R.id.b13)
        val b14=findViewById<Button>(R.id.b14)
        val b15=findViewById<Button>(R.id.b15)
        val b16=findViewById<Button>(R.id.b16)
        val b17=findViewById<Button>(R.id.b17)
        val b18=findViewById<Button>(R.id.b18)
        val b19=findViewById<Button>(R.id.b19)
        //block 3
        val b31=findViewById<Button>(R.id.b31)
        val b32=findViewById<Button>(R.id.b32)
        val b33=findViewById<Button>(R.id.b33)
        val b34=findViewById<Button>(R.id.b34)
        val b35=findViewById<Button>(R.id.b35)
        val b36=findViewById<Button>(R.id.b36)
        val b37=findViewById<Button>(R.id.b37)
        val b38=findViewById<Button>(R.id.b38)
        val b39=findViewById<Button>(R.id.b39)
        //block 4
        val b41=findViewById<Button>(R.id.b41)
        val b42=findViewById<Button>(R.id.b42)
        val b43=findViewById<Button>(R.id.b43)
        val b44=findViewById<Button>(R.id.b44)
        val b45=findViewById<Button>(R.id.b45)
        val b46=findViewById<Button>(R.id.b46)
        val b47=findViewById<Button>(R.id.b47)
        val b48=findViewById<Button>(R.id.b48)
        val b49=findViewById<Button>(R.id.b49)
        //block 5
        val b51=findViewById<Button>(R.id.b51)
        val b52=findViewById<Button>(R.id.b52)
        val b53=findViewById<Button>(R.id.b53)
        val b54=findViewById<Button>(R.id.b54)
        val b55=findViewById<Button>(R.id.b55)
        val b56=findViewById<Button>(R.id.b56)
        val b57=findViewById<Button>(R.id.b57)
        val b58=findViewById<Button>(R.id.b58)
        val b59=findViewById<Button>(R.id.b59)
        //block 6
        val b61=findViewById<Button>(R.id.b61)
        val b62=findViewById<Button>(R.id.b62)
        val b63=findViewById<Button>(R.id.b63)
        val b64=findViewById<Button>(R.id.b64)
        val b65=findViewById<Button>(R.id.b65)
        val b66=findViewById<Button>(R.id.b66)
        val b67=findViewById<Button>(R.id.b67)
        val b68=findViewById<Button>(R.id.b68)
        val b69=findViewById<Button>(R.id.b69)
        //block7
        val b71=findViewById<Button>(R.id.b71)
        val b72=findViewById<Button>(R.id.b72)
        val b73=findViewById<Button>(R.id.b73)
        val b74=findViewById<Button>(R.id.b74)
        val b75=findViewById<Button>(R.id.b75)
        val b76=findViewById<Button>(R.id.b76)
        val b77=findViewById<Button>(R.id.b77)
        val b78=findViewById<Button>(R.id.b78)
        val b79=findViewById<Button>(R.id.b79)

        //block8
        val b81=findViewById<Button>(R.id.b81)
        val b82=findViewById<Button>(R.id.b82)
        val b83=findViewById<Button>(R.id.b83)
        val b84=findViewById<Button>(R.id.b84)
        val b85=findViewById<Button>(R.id.b85)
        val b86=findViewById<Button>(R.id.b86)
        val b87=findViewById<Button>(R.id.b87)
        val b88=findViewById<Button>(R.id.b88)
        val b89=findViewById<Button>(R.id.b89)

        //block 9
        val b91=findViewById<Button>(R.id.b91)
        val b92=findViewById<Button>(R.id.b92)
        val b93=findViewById<Button>(R.id.b93)
        val b94=findViewById<Button>(R.id.b94)
        val b95=findViewById<Button>(R.id.b95)
        val b96=findViewById<Button>(R.id.b96)
        val b97=findViewById<Button>(R.id.b97)
        val b98=findViewById<Button>(R.id.b98)
        val b99=findViewById<Button>(R.id.b99)

        val hint=findViewById<Button>(R.id.hint)
        val defult=findViewById<Button>(R.id.defultButton)
        val d= Random.nextInt(1..9); val e= Random.nextInt(1..9); val f= Random.nextInt(1..9);
        val i= Random.nextInt(1..9); val j= Random.nextInt(1..9); val k= Random.nextInt(1..9);
        val l= Random.nextInt(1..9); val m= Random.nextInt(1..9); val n= Random.nextInt(1..9);

        val buttonUsed= arrayListOf<Button>(defult)
        val buttonUse= arrayListOf<Button>(defult)
        val hi = arrayListOf<Button>(
            b1,b2,b3,b4,b5,b6,b7,b8,b9,
            b31,b32,b33,b34,b35,b36,b37,b38,b39,
            b51,b52,b53,b54,b55,b56,b57,b58,b59,
            b71,b72,b73,b74,b75,b76,b77,b78,b79,
            b91,b92,b93,b94,b95,b96,b97,b98,b99
        )
        var start=0
        val buttonColour= arrayListOf<Int>()
        var trys=0; var a=0;

        fun keys(buSelected:Button){
            var trats=0
            var buttonCSize=buttonColour.size.toInt()
            buSelected.setOnClickListener {
                if (hi.contains(buSelected)){
                    buttonUse.add(buSelected);buttonUse[0].setBackgroundResource(R.drawable.org);buttonUse.remove(buttonUse[0])
                    buttonUsed[0].setBackgroundResource(R.drawable.org2)
                }
                else{
                    buttonUsed.add(buSelected);buttonUsed[0].setBackgroundResource(R.drawable.org2);buttonUsed.remove(buttonUsed[0])
                    buttonUse[0].setBackgroundResource(R.drawable.org)

                }
                buSelected.setTextColor(resources.getColor(R.color.Blue))
                buSelected.setBackgroundColor(Color.DKGRAY)
                binding.one.setOnClickListener { buSelected.text="1" ;start=0;buSelected.setBackgroundColor(Color.DKGRAY);start=0;buttonCSize=buttonColour.size.toInt();trats=0}
                binding.two.setOnClickListener { buSelected.text="2" ;start=0;buSelected.setBackgroundColor(Color.DKGRAY);start=0;buttonCSize=buttonColour.size.toInt();trats=0 }
                binding.three.setOnClickListener { buSelected.text="3" ;start=0;buSelected.setBackgroundColor(Color.DKGRAY);start=0;buttonCSize=buttonColour.size.toInt();trats=0 }
                binding.four.setOnClickListener { buSelected.text="4" ;start=0;buSelected.setBackgroundColor(Color.DKGRAY);start=0;buttonCSize=buttonColour.size.toInt();trats=0 }
                binding.five.setOnClickListener { buSelected.text="5" ;start=0;buSelected.setBackgroundColor(Color.DKGRAY);start=0;buttonCSize=buttonColour.size.toInt();trats=0 }
                binding.six.setOnClickListener { buSelected.text="6" ;start=0;buSelected.setBackgroundColor(Color.DKGRAY);start=0;buttonCSize=buttonColour.size.toInt();trats=0 }
                binding.seven.setOnClickListener { buSelected.text="7" ;start=0;buSelected.setBackgroundColor(Color.DKGRAY);start=0;buttonCSize=buttonColour.size.toInt();trats=0 }
                binding.Eight.setOnClickListener { buSelected.text="8" ;start=0;buSelected.setBackgroundColor(Color.DKGRAY);start=0;buttonCSize=buttonColour.size.toInt();trats=0 }
                binding.nine.setOnClickListener { buSelected.text="9" ;start=0;buSelected.setBackgroundColor(Color.DKGRAY);start=0;buttonCSize=buttonColour.size.toInt();trats=0 }
                findViewById<Button>(R.id.delet).setOnClickListener { buSelected.text="" }


                hint.setOnClickListener {
                    trys++
                    val abc=12-trys
                    if (trys<=12){
                        hint.text="\uD83D\uDCA1SOS  $abc"
                        when(buSelected){
                            b1->{b1.text="$d"};b2->{b2.text="$f"};b3->{b3.text="$k"};
                            b4->{b4.text="$e"};b5->{b5.text="$n"};b6->{b6.text="$l"};
                            b7->{b7.text="$m"};b8->{b8.text="$i"};b9->{b9.text="$j"};



                            b11->{b11.text="$i"};
                            b12->{b12.text="$l"};
                            b13->{b13.text="$m"};
                            b14->{b14.text="$d"};
                            b15->{b15.text="$k"};
                            b16->{b16.text="$j"};
                            b17->{b17.text="$f"};
                            b18->{b18.text="$n"};
                            b19->{b19.text="$e"};

                            b31->{b31.text="$j"};
                            b32->{b32.text="$e"};
                            b33->{b33.text="$n"};
                            b34->{b34.text="$i"};
                            b35->{b35.text="$m"};
                            b36->{b36.text="$f"};
                            b37->{b37.text="$k"};
                            b38->{b38.text="$d"};
                            b39->{b39.text="$l"};

                            b41->{b41.text="$k"};
                            b42->{b42.text="$m"};
                            b43->{b43.text="$f"};
                            b44->{b44.text="$i"};
                            b45->{b45.text="$j"};
                            b46->{b46.text="$n"};
                            b47->{b47.text="$l"};
                            b48->{b48.text="$e"};
                            b49->{b49.text="$d"};

                            b51->{b51.text="$l"};
                            b52->{b52.text="$e"};
                            b53->{b53.text="$n"};
                            b54->{b54.text="$k"};
                            b55->{b55.text="$d"};
                            b56->{b56.text="$f"};
                            b57->{b57.text="$m"};
                            b58->{b58.text="$j"};
                            b59->{b59.text="$i"};

                            b61->{b61.text="$d"};
                            b62->{b62.text="$i"};
                            b63->{b63.text="$j"};
                            b64->{b64.text="$e"};
                            b65->{b65.text="$l"};
                            b66->{b66.text="$m"};
                            b67->{b67.text="$f"};
                            b68->{b68.text="$n"};
                            b69->{b69.text="$k"};

                            b71->{b71.text="$j"};
                            b72->{b72.text="$d"};
                            b73->{b73.text="$i"};
                            b74->{b74.text="$f"};
                            b75->{b75.text="$l"};
                            b76->{b76.text="$m"};
                            b77->{b77.text="$n"};
                            b78->{b78.text="$k"};
                            b79->{b79.text="$e"};

                            b81->{b81.text="$n"};
                            b82->{b82.text="$f"};
                            b83->{b83.text="$l"};
                            b84->{b84.text="$e"};
                            b85->{b85.text="$i"};
                            b86->{b86.text="$k"};
                            b87->{b87.text="$j"};
                            b88->{b88.text="$m"};
                            b89->{b89.text="$d"};

                            b91->{b91.text="$m"};
                            b92->{b92.text="$k"};
                            b93->{b93.text="$e"};
                            b94->{b94.text="$n"};
                            b95->{b95.text="$j"};
                            b96->{b96.text="$d"};
                            b97->{b97.text="$l"};
                            b98->{b98.text="$f"};
                            b99->{b99.text="$i"};


                        }


                    }
                    else {Toast.makeText(this,"You have no more hints ajay.",Toast.LENGTH_SHORT).show()}
                }
            }
        }

        fun check(){
            val ac= 1-a
            if (a<=2) {
                findViewById<Button>(R.id.finish).setOnClickListener {
                    a++
                    if(b1.text!="$d"){b1.setBackgroundResource(R.drawable.wrong)}
                    if(b2.text!="$f"){b2.setBackgroundResource(R.drawable.wrong)}
                    if(b3.text!="$k"){b3.setBackgroundResource(R.drawable.wrong)}
                    if(b4.text!="$e"){b4.setBackgroundResource(R.drawable.wrong)}
                    if(b5.text!="$n"){b5.setBackgroundResource(R.drawable.wrong)}
                    if(b6.text!="$l"){b6.setBackgroundResource(R.drawable.wrong)}
                    if(b7.text!="$m"){b7.setBackgroundResource(R.drawable.wrong)}
                    if(b8.text!="$i"){b8.setBackgroundResource(R.drawable.wrong)}
                    if(b9.text!="$j"){b9.setBackgroundResource(R.drawable.wrong)}


                    if(b11.text!="$i"){b11.setBackgroundResource(R.drawable.wrong)}
                    if(b12.text!="$l"){b12.setBackgroundResource(R.drawable.wrong)}
                    if(b13.text!="$m"){b13.setBackgroundResource(R.drawable.wrong)}
                    if(b14.text!="$d"){b14.setBackgroundResource(R.drawable.wrong)}
                    if(b15.text!="$k"){b15.setBackgroundResource(R.drawable.wrong)}
                    if(b16.text!="$j"){b16.setBackgroundResource(R.drawable.wrong)}
                    if(b17.text!="$f"){b17.setBackgroundResource(R.drawable.wrong)}
                    if(b18.text!="$n"){b18.setBackgroundResource(R.drawable.wrong)}
                    if(b19.text!="$e"){b19.setBackgroundResource(R.drawable.wrong)}

                    if(b31.text!="$j"){b31.setBackgroundResource(R.drawable.wrong)}
                    if(b32.text!="$e"){b32.setBackgroundResource(R.drawable.wrong)}
                    if(b33.text!="$n"){b33.setBackgroundResource(R.drawable.wrong)}
                    if(b34.text!="$i"){b34.setBackgroundResource(R.drawable.wrong)}
                    if(b35.text!="$m"){b35.setBackgroundResource(R.drawable.wrong)}
                    if(b36.text!="$f"){b36.setBackgroundResource(R.drawable.wrong)}
                    if(b37.text!="$k"){b37.setBackgroundResource(R.drawable.wrong)}
                    if(b38.text!="$d"){b38.setBackgroundResource(R.drawable.wrong)}
                    if(b39.text!="$l"){b39.setBackgroundResource(R.drawable.wrong)}

                    if(b41.text!="$k"){b41.setBackgroundResource(R.drawable.wrong)}
                    if(b42.text!="$m"){b42.setBackgroundResource(R.drawable.wrong)}
                    if(b43.text!="$f"){b43.setBackgroundResource(R.drawable.wrong)}
                    if(b44.text!="$i"){b44.setBackgroundResource(R.drawable.wrong)}
                    if(b45.text!="$j"){b45.setBackgroundResource(R.drawable.wrong)}
                    if(b46.text!="$n"){b46.setBackgroundResource(R.drawable.wrong)}
                    if(b47.text!="$l"){b47.setBackgroundResource(R.drawable.wrong)}
                    if(b48.text!="$e"){b48.setBackgroundResource(R.drawable.wrong)}
                    if(b49.text!="$d"){b49.setBackgroundResource(R.drawable.wrong)}

                    if(b51.text!="$l"){b51.setBackgroundResource(R.drawable.wrong)}
                    if(b52.text!="$e"){b52.setBackgroundResource(R.drawable.wrong)}
                    if(b53.text!="$n"){b53.setBackgroundResource(R.drawable.wrong)}
                    if(b54.text!="$k"){b54.setBackgroundResource(R.drawable.wrong)}
                    if(b55.text!="$d"){b55.setBackgroundResource(R.drawable.wrong)}
                    if(b56.text!="$f"){b56.setBackgroundResource(R.drawable.wrong)}
                    if(b57.text!="$m"){b57.setBackgroundResource(R.drawable.wrong)}
                    if(b58.text!="$j"){b58.setBackgroundResource(R.drawable.wrong)}
                    if(b59.text!="$i"){b59.setBackgroundResource(R.drawable.wrong)}

                    if(b61.text!="$d"){b61.setBackgroundResource(R.drawable.wrong)}
                    if(b62.text!="$i"){b62.setBackgroundResource(R.drawable.wrong)}
                    if(b63.text!="$j"){b63.setBackgroundResource(R.drawable.wrong)}
                    if(b64.text!="$e"){b64.setBackgroundResource(R.drawable.wrong)}
                    if(b65.text!="$l"){b65.setBackgroundResource(R.drawable.wrong)}
                    if(b66.text!="$m"){b66.setBackgroundResource(R.drawable.wrong)}
                    if(b67.text!="$f"){b67.setBackgroundResource(R.drawable.wrong)}
                    if(b68.text!="$n"){b68.setBackgroundResource(R.drawable.wrong)}
                    if(b69.text!="$k"){b69.setBackgroundResource(R.drawable.wrong)}

                    if(b71.text!="$j"){b71.setBackgroundResource(R.drawable.wrong)}
                    if(b72.text!="$d"){b72.setBackgroundResource(R.drawable.wrong)}
                    if(b73.text!="$i"){b73.setBackgroundResource(R.drawable.wrong)}
                    if(b74.text!="$f"){b74.setBackgroundResource(R.drawable.wrong)}
                    if(b75.text!="$l"){b75.setBackgroundResource(R.drawable.wrong)}
                    if(b76.text!="$m"){b76.setBackgroundResource(R.drawable.wrong)}
                    if(b77.text!="$n"){b77.setBackgroundResource(R.drawable.wrong)}
                    if(b78.text!="$k"){b78.setBackgroundResource(R.drawable.wrong)}
                    if(b79.text!="$e"){b79.setBackgroundResource(R.drawable.wrong)}

                    if(b81.text!="$n"){b81.setBackgroundResource(R.drawable.wrong)}
                    if(b82.text!="$f"){b82.setBackgroundResource(R.drawable.wrong)}
                    if(b83.text!="$l"){b83.setBackgroundResource(R.drawable.wrong)}
                    if(b84.text!="$e"){b84.setBackgroundResource(R.drawable.wrong)}
                    if(b85.text!="$i"){b85.setBackgroundResource(R.drawable.wrong)}
                    if(b86.text!="$k"){b86.setBackgroundResource(R.drawable.wrong)}
                    if(b87.text!="$j"){b87.setBackgroundResource(R.drawable.wrong)}
                    if(b88.text!="$m"){b88.setBackgroundResource(R.drawable.wrong)}
                    if(b89.text!="$d"){b89.setBackgroundResource(R.drawable.wrong)}

                    if(b91.text!="$m"){b91.setBackgroundResource(R.drawable.wrong)}
                    if(b92.text!="$k"){b92.setBackgroundResource(R.drawable.wrong)}
                    if(b93.text!="$e"){b93.setBackgroundResource(R.drawable.wrong)}
                    if(b94.text!="$n"){b94.setBackgroundResource(R.drawable.wrong)}
                    if(b95.text!="$j"){b95.setBackgroundResource(R.drawable.wrong)}
                    if(b96.text!="$d"){b96.setBackgroundResource(R.drawable.wrong)}
                    if(b97.text!="$l"){b97.setBackgroundResource(R.drawable.wrong)}
                    if(b98.text!="$f"){b98.setBackgroundResource(R.drawable.wrong)}
                    if(b99.text!="$i"){b99.setBackgroundResource(R.drawable.wrong)}

                    if(b1.text=="$d" && b2.text=="$f"
                        &&b3.text!="$k"
                        &&b4.text!="$e"
                        &&b5.text!="$n"
                        &&b6.text!="$l"
                        &&b7.text!="$m"
                        &&b8.text!="$i"
                        &&b9.text!="$j"
                        &&b11.text=="$i"
                        &&b12.text=="$l"
                        &&b13.text=="$m"
                        &&b14.text=="$d"
                        &&b15.text=="$k"
                        &&b16.text=="$j"
                        &&b17.text=="$f"
                        &&b18.text=="$n"
                        &&b19.text=="$e"
                        &&b31.text=="$j"
                        &&b32.text=="$e"
                        &&b33.text=="$n"
                        &&b34.text=="$i"
                        &&b35.text=="$m"
                        &&b36.text=="$f"
                        &&b37.text=="$k"
                        &&b38.text=="$d"
                        &&b39.text=="$l"
                        &&b41.text=="$k"
                        &&b42.text=="$m"
                        &&b43.text=="$f"
                        &&b44.text=="$i"
                        &&b45.text=="$j"
                        &&b46.text=="$n"
                        &&b47.text=="$l"
                        &&b48.text=="$e"
                        &&b49.text=="$d"
                        &&b51.text=="$l"
                        &&b52.text=="$e"
                        &&b53.text=="$n"
                        &&b54.text=="$k"
                        &&b55.text=="$d"
                        &&b56.text=="$f"
                        &&b57.text=="$m"
                        &&b58.text=="$j"
                        &&b59.text=="$i"
                        &&b61.text=="$d"
                        &&b62.text=="$i"
                        &&b63.text=="$j"
                        &&b64.text=="$e"
                        &&b65.text=="$l"
                        &&b66.text=="$m"
                        &&b67.text=="$f"
                        &&b68.text=="$n"
                        &&b69.text=="$k"
                        &&b71.text=="$j"
                        &&b72.text=="$d"
                        &&b73.text=="$i"
                        &&b74.text=="$f"
                        &&b75.text=="$l"
                        &&b76.text=="$m"
                        &&b77.text=="$n"
                        &&b78.text=="$k"
                        &&b79.text=="$e"
                        &&b81.text=="$n"
                        &&b82.text=="$f"
                        &&b83.text=="$l"
                        &&b84.text=="$e"
                        &&b85.text=="$i"
                        &&b86.text=="$k"
                        &&b87.text=="$j"
                        &&b88.text=="$m"
                        &&b89.text=="$d"
                        &&b91.text=="$m"
                        &&b92.text=="$k"
                        &&b93.text=="$e"
                        &&b94.text=="$n"
                        &&b95.text=="$j"
                        &&b96.text=="$d"
                        &&b97.text=="$l"
                        &&b98.text=="$f"
                        &&b99.text=="$i"){
                        win++

                        Toast.makeText(this,"You win",Toast.LENGTH_LONG).show()
                        Handler().postDelayed({
                            board()
                            findViewById<Button>(R.id.wl).text="Win:$win Lose:$lose"
                        },1250)
                    }else if (a==2){
                        Toast.makeText(this,"You Lose",Toast.LENGTH_SHORT).show()
                        lose++;
                        Handler().postDelayed({
                            board()
                            findViewById<Button>(R.id.wl).text="Win:$win Lose:$lose"
                        },1250)
                    }
                    else{
                        Toast.makeText(this,"You have $ac more checks left",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        }
        check()


        if (d!=e&&d!=f&&f!=e){
            if (i!=j && i!=k && k!=j && d!=i && d!=j && d!=k && e!=i && e!=j && e!=k&&f!=i &&f!=j &&f!=k){
                if (l != m && l != n && n != m&& d!= l && d!= m && d!=n&& e!= l && e!= m && e!=n&& f!= l && f!= m && f!=n&& i!= l
                    &&i != m && i!=n&& j!= l && j!=m && j!=n&& k!= l &&k!=m&&k!=n){
                    //block 1
                    b1.text="$d" ;b1.setBackgroundResource(R.drawable.org);b1.setOnClickListener { b1.text="$d" };
                    b2.text="$f" ;b2.setBackgroundResource(R.drawable.org);b2.setOnClickListener { b2.text="$f" };
                    b3.text="$k" ;b3.setBackgroundResource(R.drawable.org);b3.setOnClickListener { b3.text="$k" };
                    b4.text="$e" ;b4.setBackgroundResource(R.drawable.org);b4.setOnClickListener { b4.text="$e" };
                    b5.text="$n" ;b5.setBackgroundResource(R.drawable.org);b5.setOnClickListener { b5.text="$n" };
                    b6.text="$l" ;b6.setBackgroundResource(R.drawable.org);b6.setOnClickListener { b6.text="$l" };
                    b7.text="$m" ;b7.setBackgroundResource(R.drawable.org);b7.setOnClickListener { b7.text="$m" };
                    b8.text="$i" ;b8.setBackgroundResource(R.drawable.org);b8.setOnClickListener { b8.text="$i" };
                    b9.text="$j" ;b9.setBackgroundResource(R.drawable.org);b9.setOnClickListener { b9.text="$j" };
                    //block 2
                    b11.text="$i";b11.setBackgroundResource(R.drawable.org2) ;b11.setOnClickListener { b11.text="$i" };
                    b12.text="$l";b12.setBackgroundResource(R.drawable.org2) ;b12.setOnClickListener { b12.text="$l" };
                    b13.text="$m";b13.setBackgroundResource(R.drawable.org2) ;b13.setOnClickListener { b13.text="$m" };
                    b14.text="$d";b14.setBackgroundResource(R.drawable.org2) ;b14.setOnClickListener { b14.text="$d" };
                    b15.text="$k";b15.setBackgroundResource(R.drawable.org2) ;b15.setOnClickListener { b15.text="$k" };
                    b16.text="$j";b16.setBackgroundResource(R.drawable.org2) ;b16.setOnClickListener { b16.text="$j" };
                    b17.text="$f";b17.setBackgroundResource(R.drawable.org2) ;b17.setOnClickListener { b17.text="$f" };
                    b18.text="$n";b18.setBackgroundResource(R.drawable.org2) ;b18.setOnClickListener { b18.text="$n" };
                    b19.text="$e";b19.setBackgroundResource(R.drawable.org2) ;b19.setOnClickListener { b19.text="$e" };
                    //block3
                    b31.text="$j";b31.setBackgroundResource(R.drawable.org) ;b31.setOnClickListener { b31.text="$j" };
                    b32.text="$e";b32.setBackgroundResource(R.drawable.org) ;b32.setOnClickListener { b32.text="$e" };
                    b33.text="$n";b33.setBackgroundResource(R.drawable.org) ;b33.setOnClickListener { b33.text="$n" };
                    b34.text="$i";b34.setBackgroundResource(R.drawable.org) ;b34.setOnClickListener { b34.text="$i" };
                    b35.text="$m";b35.setBackgroundResource(R.drawable.org) ;b35.setOnClickListener { b35.text="$m" };
                    b36.text="$f";b36.setBackgroundResource(R.drawable.org) ;b36.setOnClickListener { b36.text="$f" };
                    b37.text="$k";b37.setBackgroundResource(R.drawable.org) ;b37.setOnClickListener { b37.text="$k" };
                    b38.text="$d";b38.setBackgroundResource(R.drawable.org) ;b38.setOnClickListener { b38.text="$d" };
                    b39.text="$l";b39.setBackgroundResource(R.drawable.org) ;b39.setOnClickListener { b39.text="$l" };
                    //block 4
                    b41.text="$k";b41.setBackgroundResource(R.drawable.org2) ;b41.setOnClickListener { b41.text="$k" };
                    b42.text="$m";b42.setBackgroundResource(R.drawable.org2) ;b42.setOnClickListener { b42.text="$m" };
                    b43.text="$f";b43.setBackgroundResource(R.drawable.org2) ;b43.setOnClickListener { b43.text="$f" };
                    b44.text="$i";b44.setBackgroundResource(R.drawable.org2) ;b44.setOnClickListener { b44.text="$i" };
                    b45.text="$j";b45.setBackgroundResource(R.drawable.org2) ;b45.setOnClickListener { b45.text="$j" };
                    b46.text="$n";b46.setBackgroundResource(R.drawable.org2) ;b46.setOnClickListener { b46.text="$n" };
                    b47.text="$l";b47.setBackgroundResource(R.drawable.org2) ;b47.setOnClickListener { b47.text="$l" };
                    b48.text="$e";b48.setBackgroundResource(R.drawable.org2) ;b48.setOnClickListener { b48.text="$e" };
                    b49.text="$d";b49.setBackgroundResource(R.drawable.org2) ;b49.setOnClickListener { b49.text="$d" };
                    //B5
                    b52.text="$e";b2.setBackgroundResource(R.drawable.org) ;b52.setOnClickListener { b52.text="$e" };
                    b53.text="$n";b3.setBackgroundResource(R.drawable.org) ;b53.setOnClickListener { b53.text="$n" };
                    b54.text="$k";b4.setBackgroundResource(R.drawable.org) ;b54.setOnClickListener { b54.text="$k" };
                    b55.text="$d";b5.setBackgroundResource(R.drawable.org) ;b55.setOnClickListener { b55.text="$d" };
                    b56.text="$f";b6.setBackgroundResource(R.drawable.org) ;b56.setOnClickListener { b56.text="$f" };
                    b57.text="$m";b7.setBackgroundResource(R.drawable.org) ;b57.setOnClickListener { b57.text="$m" };
                    b58.text="$j";b8.setBackgroundResource(R.drawable.org) ;b58.setOnClickListener { b58.text="$j" };
                    b59.text="$i";b9.setBackgroundResource(R.drawable.org) ;b59.setOnClickListener { b59.text="$i" };
                    //b6
                    b61.text="$d";b61.setBackgroundResource(R.drawable.org2) ;b61.setOnClickListener { b61.text="$d" };
                    b62.text="$i";b62.setBackgroundResource(R.drawable.org2) ;b62.setOnClickListener { b62.text="$i" };
                    b63.text="$j";b63.setBackgroundResource(R.drawable.org2) ;b63.setOnClickListener { b63.text="$j" };
                    b64.text="$e";b64.setBackgroundResource(R.drawable.org2) ;b64.setOnClickListener { b64.text="$e" };
                    b65.text="$l";b65.setBackgroundResource(R.drawable.org2) ;b65.setOnClickListener { b65.text="$l" };
                    b66.text="$m";b66.setBackgroundResource(R.drawable.org2) ;b66.setOnClickListener { b66.text="$m" };
                    b67.text="$f";b67.setBackgroundResource(R.drawable.org2) ;b67.setOnClickListener { b67.text="$f" };
                    b68.text="$n";b68.setBackgroundResource(R.drawable.org2) ;b68.setOnClickListener { b68.text="$n" };
                    b69.text="$k";b69.setBackgroundResource(R.drawable.org2) ;b69.setOnClickListener { b69.text="$k" };
                    //b7
                    b71.text="$j";b71.setBackgroundResource(R.drawable.org) ;b71.setOnClickListener { b71.text="$j" };
                    b72.text="$d";b72.setBackgroundResource(R.drawable.org) ;b72.setOnClickListener { b72.text="$d" };
                    b73.text="$i";b73.setBackgroundResource(R.drawable.org) ;b73.setOnClickListener { b73.text="$i" };
                    b74.text="$f";b74.setBackgroundResource(R.drawable.org) ;b74.setOnClickListener { b74.text="$f" };
                    b75.text="$l";b75.setBackgroundResource(R.drawable.org) ;b75.setOnClickListener { b75.text="$l" };
                    b76.text="$m";b76.setBackgroundResource(R.drawable.org) ;b76.setOnClickListener { b76.text="$m" };
                    b77.text="$n";b77.setBackgroundResource(R.drawable.org) ;b77.setOnClickListener { b77.text="$n" };
                    b78.text="$k";b78.setBackgroundResource(R.drawable.org) ;b78.setOnClickListener { b78.text="$k" };
                    b79.text="$e";b79.setBackgroundResource(R.drawable.org) ;b79.setOnClickListener { b79.text="$e" };
                    //b8
                    b81.text="$n";b1.setBackgroundResource(R.drawable.org2) ;b81.setOnClickListener { b81.text="$n" };
                    b82.text="$f";b2.setBackgroundResource(R.drawable.org2) ;b82.setOnClickListener { b82.text="$f" };
                    b83.text="$l";b3.setBackgroundResource(R.drawable.org2) ;b83.setOnClickListener { b83.text="$l" };
                    b84.text="$e";b4.setBackgroundResource(R.drawable.org2) ;b84.setOnClickListener { b84.text="$e" };
                    b85.text="$i";b5.setBackgroundResource(R.drawable.org2) ;b85.setOnClickListener { b85.text="$i" };
                    b86.text="$k";b6.setBackgroundResource(R.drawable.org2) ;b86.setOnClickListener { b86.text="$k" };
                    b87.text="$j";b7.setBackgroundResource(R.drawable.org2) ;b87.setOnClickListener { b87.text="$j" };
                    b88.text="$m";b8.setBackgroundResource(R.drawable.org2) ;b88.setOnClickListener { b88.text="$m" };
                    b89.text="$d";b9.setBackgroundResource(R.drawable.org2) ;b89.setOnClickListener { b89.text="$d" };
                    //Block
                    b91.text="$m";b91.setBackgroundResource(R.drawable.org) ;b91.setOnClickListener { b91.text="$m" };
                    b92.text="$k";b92.setBackgroundResource(R.drawable.org) ;b92.setOnClickListener { b92.text="$k" };
                    b93.text="$e";b93.setBackgroundResource(R.drawable.org) ;b93.setOnClickListener { b93.text="$e" };
                    b94.text="$n";b94.setBackgroundResource(R.drawable.org) ;b94.setOnClickListener { b94.text="$n" };
                    b95.text="$j";b95.setBackgroundResource(R.drawable.org) ;b95.setOnClickListener { b95.text="$j" };
                    b96.text="$d";b96.setBackgroundResource(R.drawable.org) ;b96.setOnClickListener { b96.text="$d" };
                    b97.text="$l";b97.setBackgroundResource(R.drawable.org) ;b97.setOnClickListener { b97.text="$l" };
                    b98.text="$f";b98.setBackgroundResource(R.drawable.org) ;b98.setOnClickListener { b98.text="$f" };
                    b99.text="$i";b99.setBackgroundResource(R.drawable.org) ;b99.setOnClickListener { b99.text="$i" };


                    //Take away box
                    val random=Random.nextInt(50..53)
                    var a=0;
                    while (a<=random){
                        when(Random.nextInt(1..81)){
                            1->{b1.text="";keys(buSelected = b1);b1.setBackgroundResource(R.drawable.org)};
                            2->{b2.text="";keys(buSelected = b2);b2.setBackgroundResource(R.drawable.org)};
                            3->{b3.text="";keys(buSelected = b3);b3.setBackgroundResource(R.drawable.org)};
                            4->{b4.text="";keys(buSelected = b4);b4.setBackgroundResource(R.drawable.org)};
                            5->{b5.text="";keys(buSelected = b5);b5.setBackgroundResource(R.drawable.org)};
                            6->{b6.text="";keys(buSelected = b6);b6.setBackgroundResource(R.drawable.org)};
                            7->{b7.text="";keys(buSelected = b7);b7.setBackgroundResource(R.drawable.org)};
                            8->{b8.text="";keys(buSelected = b8);b8.setBackgroundResource(R.drawable.org)};
                            9->{b9.text="";keys(buSelected = b9);b9.setBackgroundResource(R.drawable.org)};

                            11->{b11.text="";keys(buSelected = b11);b11.setBackgroundResource(R.drawable.org2)};
                            12->{b12.text="";keys(buSelected = b12);b12.setBackgroundResource(R.drawable.org2)};
                            13->{b13.text="";keys(buSelected = b13);b13.setBackgroundResource(R.drawable.org2)};
                            14->{b14.text="";keys(buSelected = b14);b14.setBackgroundResource(R.drawable.org2)};
                            15->{b15.text="";keys(buSelected = b15);b15.setBackgroundResource(R.drawable.org2)};
                            16->{b16.text="";keys(buSelected = b16);b16.setBackgroundResource(R.drawable.org2)};
                            17->{b17.text="";keys(buSelected = b17);b17.setBackgroundResource(R.drawable.org2)};
                            18->{b18.text="";keys(buSelected = b18);b18.setBackgroundResource(R.drawable.org2)};
                            19->{b19.text="";keys(buSelected = b19);b19.setBackgroundResource(R.drawable.org2)};

                            31->{b31.text="";keys(buSelected = b31);b31.setBackgroundResource(R.drawable.org)};
                            32->{b32.text="";keys(buSelected = b32);b32.setBackgroundResource(R.drawable.org)};
                            33->{b33.text="";keys(buSelected = b33);b33.setBackgroundResource(R.drawable.org)};
                            34->{b34.text="";keys(buSelected = b34);b34.setBackgroundResource(R.drawable.org)};
                            35->{b35.text="";keys(buSelected = b35);b35.setBackgroundResource(R.drawable.org)};
                            36->{b36.text="";keys(buSelected = b36);b36.setBackgroundResource(R.drawable.org)};
                            37->{b37.text="";keys(buSelected = b37);b37.setBackgroundResource(R.drawable.org)};
                            38->{b38.text="";keys(buSelected = b38);b38.setBackgroundResource(R.drawable.org)};
                            39->{b39.text="";keys(buSelected = b39);b39.setBackgroundResource(R.drawable.org)};

                            41->{b41.text="";keys(buSelected = b41);b41.setBackgroundResource(R.drawable.org2)};
                            42->{b42.text="";keys(buSelected = b42);b42.setBackgroundResource(R.drawable.org2)};
                            43->{b43.text="";keys(buSelected = b43);b43.setBackgroundResource(R.drawable.org2)};
                            44->{b44.text="";keys(buSelected = b44);b44.setBackgroundResource(R.drawable.org2)};
                            45->{b45.text="";keys(buSelected = b45);b45.setBackgroundResource(R.drawable.org2)};
                            46->{b46.text="";keys(buSelected = b46);b46.setBackgroundResource(R.drawable.org2)};
                            47->{b47.text="";keys(buSelected = b47);b47.setBackgroundResource(R.drawable.org2)};
                            48->{b48.text="";keys(buSelected = b48);b48.setBackgroundResource(R.drawable.org2)};
                            49->{b49.text="";keys(buSelected = b49);b49.setBackgroundResource(R.drawable.org2)};

                            51->{b51.text="";keys(buSelected = b51);b51.setBackgroundResource(R.drawable.org)};
                            52->{b52.text="";keys(buSelected = b52);b52.setBackgroundResource(R.drawable.org)};
                            53->{b53.text="";keys(buSelected = b53);b53.setBackgroundResource(R.drawable.org)};
                            54->{b54.text="";keys(buSelected = b54);b54.setBackgroundResource(R.drawable.org)};
                            55->{b55.text="";keys(buSelected = b55);b55.setBackgroundResource(R.drawable.org)};
                            56->{b56.text="";keys(buSelected = b56);b56.setBackgroundResource(R.drawable.org)};
                            57->{b57.text="";keys(buSelected = b57);b57.setBackgroundResource(R.drawable.org)};
                            58->{b58.text="";keys(buSelected = b58);b58.setBackgroundResource(R.drawable.org)};
                            59->{b59.text="";keys(buSelected = b59);b59.setBackgroundResource(R.drawable.org2)}

                            61->{b61.text="";keys(buSelected = b61);b61.setBackgroundResource(R.drawable.org2)};
                            62->{b62.text="";keys(buSelected = b62);b62.setBackgroundResource(R.drawable.org2)};
                            63->{b63.text="";keys(buSelected = b63);b63.setBackgroundResource(R.drawable.org2)};
                            64->{b64.text="";keys(buSelected = b64);b64.setBackgroundResource(R.drawable.org2)};
                            65->{b65.text="";keys(buSelected = b65);b65.setBackgroundResource(R.drawable.org2)};
                            66->{b66.text="";keys(buSelected = b66);b66.setBackgroundResource(R.drawable.org2)};
                            67->{b67.text="";keys(buSelected = b67);b67.setBackgroundResource(R.drawable.org2)};
                            68->{b68.text="";keys(buSelected = b68);b68.setBackgroundResource(R.drawable.org2)};
                            69->{b69.text="";keys(buSelected = b69);b69.setBackgroundResource(R.drawable.org2)};

                            71->{b71.text="";keys(buSelected = b71);b71.setBackgroundResource(R.drawable.org)};
                            72->{b72.text="";keys(buSelected = b72);b72.setBackgroundResource(R.drawable.org)};
                            73->{b73.text="";keys(buSelected = b73);b73.setBackgroundResource(R.drawable.org)};
                            74->{b74.text="";keys(buSelected = b74);b74.setBackgroundResource(R.drawable.org)};
                            75->{b75.text="";keys(buSelected = b75);b75.setBackgroundResource(R.drawable.org)};
                            76->{b76.text="";keys(buSelected = b76);b76.setBackgroundResource(R.drawable.org)};
                            77->{b77.text="";keys(buSelected = b77);b77.setBackgroundResource(R.drawable.org)};
                            78->{b78.text="";keys(buSelected = b78);b78.setBackgroundResource(R.drawable.org)};
                            79->{b79.text="";keys(buSelected = b79);b79.setBackgroundResource(R.drawable.org)};

                            81->{b81.text="";keys(buSelected = b81);b81.setBackgroundResource(R.drawable.org2)};
                            21->{b82.text="";keys(buSelected = b82);b82.setBackgroundResource(R.drawable.org2)};
                            22->{b83.text="";keys(buSelected = b83);b83.setBackgroundResource(R.drawable.org2)};
                            23->{b84.text="";keys(buSelected = b84);b84.setBackgroundResource(R.drawable.org2)};
                            24->{b85.text="";keys(buSelected = b85);b85.setBackgroundResource(R.drawable.org2)};
                            25->{b86.text="";keys(buSelected = b86);b86.setBackgroundResource(R.drawable.org2)};
                            26->{b87.text="";keys(buSelected = b87);b87.setBackgroundResource(R.drawable.org2)};
                            27->{b88.text="";keys(buSelected = b88);b88.setBackgroundResource(R.drawable.org2)};
                            28->{b89.text="";keys(buSelected = b89);b89.setBackgroundResource(R.drawable.org2)};

                            10->{b91.text="";keys(buSelected = b91);b91.setBackgroundResource(R.drawable.org)};
                            20->{b92.text="";keys(buSelected = b92);b92.setBackgroundResource(R.drawable.org)};
                            30->{b93.text="";keys(buSelected = b93);b93.setBackgroundResource(R.drawable.org)};
                            40->{b94.text="";keys(buSelected = b94);b94.setBackgroundResource(R.drawable.org)};
                            50->{b95.text="";keys(buSelected = b95);b95.setBackgroundResource(R.drawable.org)};
                            60->{b96.text="";keys(buSelected = b96);b96.setBackgroundResource(R.drawable.org)};
                            70->{b97.text="";keys(buSelected = b97);b97.setBackgroundResource(R.drawable.org)};
                            80->{b98.text="";keys(buSelected = b98);b98.setBackgroundResource(R.drawable.org)};
                            29->{b99.text="";keys(buSelected = b99);b99.setBackgroundResource(R.drawable.org)};
                        }
                        a++;
                    }
                }
                else  if (l == m || l == n || n == m|| d== l || d== m || d==n|| e== l || e== m || e==n|| f== l || f== m || f==n|| i== l ||i == m || i==n|| j== l || j==m || j==n|| k== l
                    ||k==m||k==n){board()}

            }
            else if(i==j || i==k || k==j || d==i || d==j || d==k || e==i || e==j || e==k||f==i ||f==j || f==k){ board() }
        }
        else if (d==e ||d==f||f==e){board()}

    }


}