import 'package:english_words/english_words.dart';
import 'package:flutter/material.dart';

class SavedList extends StatefulWidget {

  SavedList({@required this.saved}); //중괄호 쓴 이유 : 인스턴스를 생성할때
  final Set<WordPair> saved;

  @override
  State<StatefulWidget> createState() => _SavedListState();
}

class _SavedListState extends State<SavedList> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Saved"),
      ),
      body: _buildList(),
    );
  }

  Widget _buildList()
  {
    return ListView.builder(itemCount: widget.saved.length*2,itemBuilder: (context,index){
      if (index.isOdd)
        return Divider();

      var realIndex=index ~/2;

      return _buildRow(widget.saved.toList()[realIndex]); //set은 tolist 인덱스를 보내서 ..

    });
  }

  Widget _buildRow(WordPair pair){
    return ListTile(
      title: Text(pair.asPascalCase,textScaleFactor: 1.5,),
      onTap: (){
        setState(() {
          widget.saved.remove(pair); //빈 하트 연동이 안돼요 ㅠㅠ..왜일까??
        });
      },
    );
  }
}

