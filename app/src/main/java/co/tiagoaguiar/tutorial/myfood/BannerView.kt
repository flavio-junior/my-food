package co.tiagoaguiar.tutorial.myfood

import android.view.ViewGroup
import co.tiagoaguiar.atway.ui.adapter.ATViewHolder
import co.tiagoaguiar.tutorial.myfood.databinding.BannerItemBinding
import com.squareup.picasso.Picasso

class BannerView(viewGroup: ViewGroup) : ATViewHolder<Banner, BannerItemBinding>(
  BannerItemBinding::inflate,
  viewGroup
) {

  override fun bind(item: Banner) {
    Picasso.get()
      .load(item.bannerUrl)
      .into(binding.imgBanner)
  }

}