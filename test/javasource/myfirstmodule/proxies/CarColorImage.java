// This file was generated by Mendix Business Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixIdentifier;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * 
 */
public class CarColorImage extends system.proxies.Image
{
	/**
	 * Internal name of this entity
	 */
	public static final String entityName = "MyFirstModule.CarColorImage";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		PublicThumbnailPath("PublicThumbnailPath"),
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents"),
		CarColor_CarColorImage("MyFirstModule.CarColor_CarColorImage");

		private String metaName;

		MemberNames(String s)
		{
			metaName = s;
		}

		@Override
		public String toString()
		{
			return metaName;
		}
	}

	public CarColorImage(IContext context)
	{
		this(context, Core.instantiate(context, "MyFirstModule.CarColorImage"));
	}

	protected CarColorImage(IContext context, IMendixObject carColorImageMendixObject)
	{
		super(context, carColorImageMendixObject);
		if (!Core.isSubClassOf("MyFirstModule.CarColorImage", carColorImageMendixObject.getType()))
			throw new IllegalArgumentException("The given object is not a MyFirstModule.CarColorImage");
	}

	/**
	 * @deprecated Use 'CarColorImage.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static myfirstmodule.proxies.CarColorImage initialize(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		return myfirstmodule.proxies.CarColorImage.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.CarColorImage initialize(IContext context, IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.CarColorImage(context, mendixObject);
	}

	public static myfirstmodule.proxies.CarColorImage load(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		IMendixObject mendixObject = Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.CarColorImage.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.CarColorImage> load(IContext context, String xpathConstraint) throws CoreException
	{
		java.util.List<myfirstmodule.proxies.CarColorImage> result = new java.util.ArrayList<myfirstmodule.proxies.CarColorImage>();
		for (IMendixObject obj : Core.retrieveXPathQuery(context, "//MyFirstModule.CarColorImage" + xpathConstraint))
			result.add(myfirstmodule.proxies.CarColorImage.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of CarColor_CarColorImage
	 */
	public final myfirstmodule.proxies.CarColor getCarColor_CarColorImage() throws CoreException
	{
		return getCarColor_CarColorImage(getContext());
	}

	/**
	 * @param context
	 * @return value of CarColor_CarColorImage
	 */
	public final myfirstmodule.proxies.CarColor getCarColor_CarColorImage(IContext context) throws CoreException
	{
		myfirstmodule.proxies.CarColor result = null;
		IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.CarColor_CarColorImage.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.CarColor.load(context, identifier);
		return result;
	}

	/**
	 * Set value of CarColor_CarColorImage
	 * @param carcolor_carcolorimage
	 */
	public final void setCarColor_CarColorImage(myfirstmodule.proxies.CarColor carcolor_carcolorimage)
	{
		setCarColor_CarColorImage(getContext(), carcolor_carcolorimage);
	}

	/**
	 * Set value of CarColor_CarColorImage
	 * @param context
	 * @param carcolor_carcolorimage
	 */
	public final void setCarColor_CarColorImage(IContext context, myfirstmodule.proxies.CarColor carcolor_carcolorimage)
	{
		if (carcolor_carcolorimage == null)
			getMendixObject().setValue(context, MemberNames.CarColor_CarColorImage.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.CarColor_CarColorImage.toString(), carcolor_carcolorimage.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.CarColorImage that = (myfirstmodule.proxies.CarColorImage) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static String getType()
	{
		return "MyFirstModule.CarColorImage";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Override
	@Deprecated
	public String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
