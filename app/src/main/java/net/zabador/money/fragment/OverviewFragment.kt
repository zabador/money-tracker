package net.zabador.money.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import net.zabador.money.R

/**
 * Created by Skye Schneider. The mad king of Domino's
 * in the year of our Lord 8/25/17.
 */

class OverviewFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater!!.inflate(R.layout.fragment_main, container, false)
        return rootView
    }

    companion object {
        /**
         * Returns a new instance of this fragment
         */
        fun newInstance(): OverviewFragment {
            return OverviewFragment()
        }
    }
}
