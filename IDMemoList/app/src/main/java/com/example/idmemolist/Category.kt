package com.example.idmemolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.idmemolist.databinding.ActivityCategoryBinding
import com.example.idmemolist.databinding.ActivityUserpwCopyBinding
import com.example.idmemolist.databinding.CategoryBoxBinding
import com.example.idmemolist.databinding.CategoryGridBinding
import java.util.jar.Attributes

class Category : AppCompatActivity() {

    val binding: ActivityCategoryBinding = ActivityCategoryBinding.inflate(layoutInflater)

    lateinit var categoryAdapter: CategoryAdapter
    val datas = mutableListOf<Namedata>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.category_box, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        categoryAdapter = CategoryAdapter(view.context)
        binding.gridView1.adapter = categoryAdapter // 리사이클러뷰의 어댑터를 instaAdapter로 지정해줌
        binding.gridView1.addItemDecoration(RecyclerDecoration(20))
        loadDatas() // 데이터를 임의로 생성하고 어댑터에 전달
    }

    private fun loadDatas() {
        datas.apply {
            add(
                Namedata(
                    image = "이미지 파일 or 링크",
                    name = "userName"
                )
            )
            add(
                Namedata(
                    image = "이미지 파일 or 링크",
                    name = "userName"
                )
            )
            add(
                Namedata(
                    image = "이미지 파일 or 링크",
                    name = "userName"
                )
            )
            CategoryAdapter.itemList= datas
            CategoryAdapter.notifyDataSetChanged() // 데이터가 갱신됨을 어댑터에 알려주는 역할
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
            val binding: ActivityCategoryBinding = ActivityCategoryBinding.inflate(layoutInflater)
            val view = binding.root
            setContentView(view)

            binding.depth1Logobutton.setOnClickListener {
                openHOME()
            }
            binding.depth1Homebtn.setOnClickListener {
                openHOME()
            }


        }


    private fun openHOME()
        {
            val intent = Intent(this, Category::class.java)
            intent.putExtra("Category", "Category")
            startActivity(intent)
        }

    }

class CategoryAdapter(private var itemList:List<Namedata>): RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>(){
    inner class CategoryViewHolder(val binding:CategoryBoxBinding):RecyclerView.ViewHolder(binding.root){
        val username = itemView.findViewById<TextView>(R.id.depth1_textview)
        val img_profile = itemView.findViewById<ImageButton>(R.id.depth1_imgbtn)

        fun bind(namedata: Namedata) {
            username.text = namedata.name
            Glide.with(itemView).load(namedata.image).into(img_profile)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.category_box,parent,false)
        return CategoryViewHolder(CategoryBoxBinding.bind(view))
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
       val item=itemList[position]
        holder.binding.apply {
            depth1Textview.text=item.name
        }
        holder.bind(itemList[position])

    }
}

class Namedata(var image:String?,var name:String?)
class sample
{
    private var items=ArrayList<Namedata>()
    fun getItems():ArrayList<Namedata>{
        val hj=Namedata(
            "image","+"
        )
        items.add(hj)
        return items
    }

}