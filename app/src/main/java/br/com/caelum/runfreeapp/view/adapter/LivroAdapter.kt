package br.com.caelum.runfreeapp.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import br.com.caelum.runfreeapp.databinding.ItemLivroBinding
import br.com.caelum.runfreeapp.view.adapter.LivroAdapter.LivroViewHolder
import br.com.caelum.runfreeapp.view.entity.LivroViewEntity

class LivroAdapter(val livros: List<LivroViewEntity>) : Adapter<LivroViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LivroViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        val livroBinding = ItemLivroBinding.inflate(inflater, parent, false)

        return LivroViewHolder(livroBinding)
    }

    override fun getItemCount(): Int = livros.size

    override fun onBindViewHolder(holder: LivroViewHolder, position: Int) {
        val livroViewEntity = livros[position]
        holder.binding.livro = livroViewEntity
    }


    class LivroViewHolder(val binding: ItemLivroBinding) : ViewHolder(binding.root)
}
