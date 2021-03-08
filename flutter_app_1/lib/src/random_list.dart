import 'package:flutter/material.dart';
import 'package:english_words/english_words.dart';
import 'saved.dart';

class RandomList extends StatefulWidget {
  @override
  State<StatefulWidget> createState() => _RandomListState(); //상태를 return !!

}

class _RandomListState extends State<RandomList> {

  final List<WordPair> _suggestion = <WordPair>[];
  final Set<WordPair> _saved = Set<WordPair>();

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text("Naming APP"),
        actions: <Widget>[
          IconButton(
            icon: Icon(Icons.list),
            onPressed: () {
              Navigator
                  .of(context)
                  .push(
                  MaterialPageRoute(builder: (context) => SavedList(saved:_saved)
                  ));
              },
          )
        ],
      ),
      body: _buildList(),
    );
  }

  Widget _buildList() {
    return ListView.builder(itemBuilder: (context, index) {
      if (index.isOdd) {
        return Divider();
      }
      var realIndex = index ~/ 2;
      //0,2,4,6,8= real items
      //1,3,5,7,9...= divider

      if (realIndex >= _suggestion.length) {
        _suggestion.addAll(generateWordPairs().take(10));
      }
      return _buildRow(_suggestion[realIndex]);
    });
  }

  Widget _buildRow(WordPair pair) {
    final bool alreadySaved = _saved.contains(pair);

    return ListTile(
      title: Text(
        pair.asPascalCase.toString(),
        textScaleFactor: 1.5,
      ),
      trailing: Icon(
        alreadySaved ? Icons.favorite : Icons.favorite_border,
        color: Colors.pink,
      ),
      onTap: () {
        setState(() {
          if (alreadySaved) //하트 표시 없앨 것인가?
            _saved.remove(pair); //true
          else
            _saved.add(pair); //false
        });
      },
    );
  }
}
