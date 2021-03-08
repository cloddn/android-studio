import 'package:flutter/material.dart';
import 'package:english_words/english_words.dart';
import 'package:flutter_app_1/src/random_list.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget{
  @override
  Widget build(BuildContext context) => MaterialApp(
      home: RandomList(),
    );
}

