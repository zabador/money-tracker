package net.zabador.money.fragment

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import net.zabador.money.R
import net.zabador.money.Transaction
import net.zabador.money.fragment.TransactionFragment.OnListFragmentInteractionListener

/**
 * [RecyclerView.Adapter] that can display a [DummyItem] and makes a call to the
 * specified [OnListFragmentInteractionListener].
 * TODO: Replace the implementation with code for your data type.
 */
class MyTransactionRecyclerViewAdapter(private val mValues: List<Transaction>, private val mListener: OnListFragmentInteractionListener?) : RecyclerView.Adapter<MyTransactionRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.fragment_transaction, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.mItem = mValues[position]
        holder.mDateView.text = mValues[position].date
        holder.mPlaceView.text = mValues[position].place
        holder.mAmountView.text = String.format("%s%s", "$", mValues[position].amount)

        holder.mView.setOnClickListener {
            mListener?.onListFragmentInteraction(holder.mItem as Transaction)
        }
    }

    override fun getItemCount(): Int {
        return mValues.size
    }

    inner class ViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
        val mDateView: TextView
        val mPlaceView: TextView
        val mAmountView: TextView
        var mItem: Transaction? = null

        init {
            mDateView = mView.findViewById(R.id.date) as TextView
            mPlaceView = mView.findViewById(R.id.place) as TextView
            mAmountView = mView.findViewById(R.id.amount) as TextView
        }

        override fun toString(): String {
            return super.toString() + " '" + mPlaceView.text + "'"
        }
    }
}
