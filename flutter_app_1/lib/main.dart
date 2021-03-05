import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget{
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
            title: Text("Naming APP")
        ),
        body: Center(child:Text("body text",textScaleFactor: 1.5,),),
      ),
    );
  }
}


