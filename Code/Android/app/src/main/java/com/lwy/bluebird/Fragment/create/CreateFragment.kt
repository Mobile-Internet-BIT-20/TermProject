package com.lwy.bluebird.Fragment.create

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.lwy.bluebird.Fragment.publichome.CreateAdapter
import com.lwy.bluebird.databinding.FragmentCreateBinding

class CreateFragment : Fragment() {

    private  var _binding: FragmentCreateBinding? = null
    private val binding: FragmentCreateBinding
        get() = _binding!!

    var img = mutableListOf<Uri>()

    private val adapter: CreateAdapter by lazy{
        CreateAdapter()
    }

    private val CODE_PICK_IMAGE = 1

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCreateBinding.inflate(inflater, container, false)

        binding.rvImage.adapter = adapter
        binding.rvImage.layoutManager = GridLayoutManager(this.requireContext(), 3)


        binding.pickImageButton.setOnClickListener {
            val intent = Intent()
            intent.type = "image/*"
            intent.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true)
            intent.action = Intent.ACTION_GET_CONTENT
            val chooser = Intent.createChooser(intent, "选择图片（最多9张）")
            startActivityForResult(chooser,CODE_PICK_IMAGE)
        }

        binding.closeButton.setOnClickListener {
            Toast.makeText(requireContext(), "信息将不被保存", Toast.LENGTH_SHORT).show()
            requireActivity().onBackPressed()
        }


        binding.postButton.setOnClickListener {
            Toast.makeText(requireContext(), "发布成功", Toast.LENGTH_SHORT).show()
        }


        return binding.root
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        var count = 0

        if(data?.clipData != null){
            count = data?.clipData!!.itemCount
        } else if(data?.data != null){
            count = 1
        }


        if(requestCode == CODE_PICK_IMAGE && resultCode == Activity.RESULT_OK){
            if(count <= 9) {
                if (count > 1) {
                    for (i in 0..count - 1) {
                        img.add(data?.clipData!!.getItemAt(i).uri)
                    }
                    adapter.setData(img)
                    adapter.notifyDataSetChanged()
                } else {
                    var uri = data?.data!!
                    img.add(uri)
                    adapter.setData(img)
                }
                Toast.makeText(requireContext(), "选择了" + count + "张图片", Toast.LENGTH_SHORT).show()
                binding.pickImageButton.visibility = View.GONE
            } else {
                Toast.makeText(requireContext(), "您选择了多于9张图片,请重新选择", Toast.LENGTH_LONG).show()
            }
        }
        adapter.notifyDataSetChanged()
    }
}