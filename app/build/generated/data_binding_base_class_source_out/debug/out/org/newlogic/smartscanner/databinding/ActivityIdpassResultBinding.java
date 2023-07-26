// Generated by view binder compiler. Do not edit!
package org.newlogic.smartscanner.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.newlogic.smartscanner.R;

public final class ActivityIdpassResultBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatEditText cardPinCode;

  @NonNull
  public final TextView hex;

  @NonNull
  public final LinearLayout layout;

  @NonNull
  public final AppCompatButton pinCodeAuth;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final TextView toolbarTitle;

  private ActivityIdpassResultBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatEditText cardPinCode, @NonNull TextView hex, @NonNull LinearLayout layout,
      @NonNull AppCompatButton pinCodeAuth, @NonNull Toolbar toolbar,
      @NonNull TextView toolbarTitle) {
    this.rootView = rootView;
    this.cardPinCode = cardPinCode;
    this.hex = hex;
    this.layout = layout;
    this.pinCodeAuth = pinCodeAuth;
    this.toolbar = toolbar;
    this.toolbarTitle = toolbarTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityIdpassResultBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityIdpassResultBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_idpass_result, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityIdpassResultBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.card_pin_code;
      AppCompatEditText cardPinCode = rootView.findViewById(id);
      if (cardPinCode == null) {
        break missingId;
      }

      id = R.id.hex;
      TextView hex = rootView.findViewById(id);
      if (hex == null) {
        break missingId;
      }

      id = R.id.layout;
      LinearLayout layout = rootView.findViewById(id);
      if (layout == null) {
        break missingId;
      }

      id = R.id.pin_code_auth;
      AppCompatButton pinCodeAuth = rootView.findViewById(id);
      if (pinCodeAuth == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = rootView.findViewById(id);
      if (toolbar == null) {
        break missingId;
      }

      id = R.id.toolbarTitle;
      TextView toolbarTitle = rootView.findViewById(id);
      if (toolbarTitle == null) {
        break missingId;
      }

      return new ActivityIdpassResultBinding((ConstraintLayout) rootView, cardPinCode, hex, layout,
          pinCodeAuth, toolbar, toolbarTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
