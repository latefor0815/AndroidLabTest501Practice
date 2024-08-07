package com.busanit501.androidlabtest501.miniProject.test0709.ksy1028_mini

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.busanit501.androidlabtest501.databinding.Ksy1028Ch11ItemSimpleRecycler3Binding

class Ch11MyAdapterSample3(val datas: MutableList<String> ) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    // 어댑터에 뷰홀더 연결하기.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder  =
        Ch11MyViewHolder3(Ksy1028Ch11ItemSimpleRecycler3Binding.inflate(LayoutInflater.from(parent.context),parent, false))

    // 목록 요소의 갯수, 화면에 출력이 되는 갯수
    override fun getItemCount(): Int {
        return datas.size
    }

    // 해당 연결 된 뷰에, 데이터 넣기.
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        // 어댑터에 연결된 뷰 바인딩 -> 용도, 뷰를 선택하기.
        val binding = (holder as Ch11MyViewHolder3).binding
        // 더미 데이터로 , food2 같은 이미지로 재사용.
//        binding.ch11RecyclerItemImg =
        // 더미 데이터로, 문자열만, 내가 정한 임의의 데이터를 넣기.
        binding.ch11Recycler3ItemTextView.text = datas[position]
        // 해당 아이템 요소 클릭시 , 발생하는 이벤트 리스너 추가하기.
        binding.ch11ItemRoot.setOnClickListener {
            Log.d("lsy", "목록 요소가 클릭됨 : $position")
        }
    }
}